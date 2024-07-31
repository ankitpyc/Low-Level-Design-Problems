package service

import (
	domain "main/internal/domain"
	"main/repository"
)

type MatchServiceInf interface {
	UpdateMatch(match *domain.Match) error
}

type MatchService struct {
	repository *repository.MatchesRepository
}

func (ms *MatchService) CreateMatch(tid, startDate string, matchType domain.MatchType, team1, team2 domain.TeamName) *domain.Match {
	return domain.CreateMatch(tid, matchType, startDate, team1, team2)
}

func NewMatchService() *MatchService {
	return &MatchService{
		repository: repository.CreateMatchRepository(),
	}
}
