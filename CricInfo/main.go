package main

import (
	"fmt"
	domain "main/internal/domain"
	service "main/service"
	"os"
)

func main() {
	tournamentService := service.NewTournamentService()
	tournament, err := tournamentService.CreateTournament("Ranji Trophy", "01-08-2024", "10-08-2024", domain.INDIA, domain.NewZealand)
	if err != nil {
		fmt.Println("Error while creating tournament . Exiting")
		os.Exit(0)
	}
	tournamentService.AddMatchesToTournament(tournament.TournamentId, 3, domain.T20)
	gs := service.GameService{}
	go gs.PlayGame(tournament)
}
