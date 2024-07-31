package domain

import (
	"github.com/google/uuid"
)

type Tournament struct {
	TournamentId   string
	Participants   []TeamName
	StartDateTime  string
	EndDateTime    string
	Matches        []*Match
	TournamentName string
}

func CreateTournament(tournamentName string, startDate string, endDate string, Team1 TeamName, Team2 TeamName) *Tournament {
	tournament := &Tournament{
		TournamentId:   uuid.NewString(),
		StartDateTime:  startDate,
		Participants:   make([]TeamName, 0),
		EndDateTime:    endDate,
		Matches:        make([]*Match, 0),
		TournamentName: tournamentName,
	}
	tournament.Participants = append(tournament.Participants, Team1, Team2)
	return tournament
}
