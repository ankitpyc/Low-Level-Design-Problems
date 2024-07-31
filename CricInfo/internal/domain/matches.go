package domain

import (
	"github.com/google/uuid"
)

type Match struct {
	MatchId          string
	TournamentId     string
	StartDate        string
	OverDetails      []Overs
	Status           MatchStatus
	Team1            TeamName
	Team2            TeamName
	Winner           TeamName
	ScoreBoard       *MatchScoreBoard
	MatchType        MatchType
	PlayerOfTheMatch string
	Commentary       []string
}

func CreateMatch(tournamentId string, matchType MatchType, startDate string, team1, team2 TeamName) *Match {
	return &Match{
		MatchId:      uuid.NewString(),
		TournamentId: tournamentId,
		Team1:        team1,
		Team2:        team2,
		StartDate:    startDate,
		MatchType:    matchType,
		ScoreBoard:   CreateScoreBoard(),
		Commentary:   make([]string, 0),
	}
}

func (mt *Match) GetScoreBoard() {

}
