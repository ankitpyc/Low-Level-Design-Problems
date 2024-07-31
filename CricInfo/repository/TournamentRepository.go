package repository

import (
	database "main/internal/database"
	domain "main/internal/domain"
	"sync"
)

type TournamentRepositoryInf interface {
	AddTournament(tournament *domain.Tournament) error
	RemoveTournament(tournamentId string) error
	UpdateTournament(tournament *domain.Tournament) error
	AbandonMatch(tournamentId string, matchId string) bool
}

type TournamentRepository struct {
	sync.RWMutex
	DB *database.Database
}

func NewTournamentRepository() *TournamentRepository {
	return &TournamentRepository{
		DB: database.GetDB(),
	}
}

func (tr *TournamentRepository) AddTournament(tournament *domain.Tournament) error {
	tr.Lock()
	defer tr.Unlock()
	tr.DB.Save(tournament.TournamentId, tournament)
	return nil
}

func (tr *TournamentRepository) RemoveTournament(tournamentId string) error {
	tr.Lock()
	defer tr.Unlock()
	tr.DB.Delete(tournamentId)
	return nil
}
