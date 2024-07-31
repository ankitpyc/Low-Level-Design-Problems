package service

import (
	"fmt"
	domain "main/internal/domain"
	"main/repository"
)

type TournamentInf interface {
	CreateTourment(tournamentName string, startDate string, endDate string, team1 domain.TeamName, team2 domain.TeamName) (*domain.Tournament, error)
	CancelTournament(tournamentId string) (bool, error)
	AddMatchesToTournament(TournamentId string, NoOfMatches int) (bool, error)
}

type TournamentService struct {
	repository   repository.TournamentRepository
	matchService *MatchService
}

func NewTournamentService() *TournamentService {
	return &TournamentService{
		repository:   *repository.NewTournamentRepository(),
		matchService: NewMatchService(),
	}
}

func (ts *TournamentService) CreateTournament(tournamentName, startDate, endDate string, team1, team2 domain.TeamName) (*domain.Tournament, error) {
	tournament := domain.CreateTournament(tournamentName, startDate, endDate, team1, team2)
	ts.repository.DB.Save(tournament.TournamentId, tournament)
	return tournament, nil
}

func (ts *TournamentService) CancelTournament(tournamentName, startDate, endDate string, team1, team2 domain.TeamName) (*domain.Tournament, error) {
	tournament := domain.CreateTournament(tournamentName, startDate, endDate, team1, team2)
	return tournament, nil
}

func (ts *TournamentService) AddMatchesToTournament(tournamentId string, noOfMatches int, matchType domain.MatchType) {
	tournament, err := ts.repository.DB.Get(tournamentId).(domain.Tournament)
	if !err {
		fmt.Print("Tournament not found !!")
	}
	dates := [3]string{"03-08-2024", "06-08-2024", "09-08-2024"}
	for j := 0; j < int(noOfMatches); j++ {
		match := ts.matchService.CreateMatch(tournamentId, dates[j], matchType, tournament.Participants[0], tournament.Participants[1])
		tournament.Matches = append(tournament.Matches, match)
	}
}
