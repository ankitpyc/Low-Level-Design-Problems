package repository

import (
	"fmt"
	database "main/internal/database"
	domain "main/internal/domain"
	"sync"
)

type MatchesRepositoryInf interface {
	SetMatchStatus(matchId string, status domain.MatchStatus) error
	AddCommentry(matchId string, commentry string)
	UpdateMatch(tournamentId string, match *domain.Match) error
	GetMatch(tournamentId string, matchId string)
}

type MatchesRepository struct {
	sync.Mutex
	DB *database.Database
}

func CreateMatchRepository() *MatchesRepository {
	return &MatchesRepository{
		DB: database.GetDB(),
	}
}

func (mr *MatchesRepository) AbandonMatch(tournamentId string, matchId string) (bool, error) {
	matchDetails, ok := mr.DB.Get(matchId).(*domain.Match)
	if !ok {
		return false, fmt.Errorf("invalid Implicit converision from interface{} to *Match")
	}
	matchDetails.Status = domain.ABANDONED
	return true, nil
}
