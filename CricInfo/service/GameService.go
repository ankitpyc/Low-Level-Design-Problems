package service

import (
	"fmt"
	domain "main/internal/domain"
)

type GameServiceInf interface {
	PlayGame(*domain.Tournament, *domain.Match)
	UpdateInningsScoreBoard(*domain.Match, *domain.Ball)
	UpdateCommentary(*domain.Match)
	RotateStrike(*domain.Match)
}

type GameService struct{}

func (gs *GameService) PlayGame(t *domain.Tournament) {
	// Simulate playing the game
	fmt.Println("Starting tournamnet ", t.TournamentName)
	for k := 0; k < len(t.Matches); k++ {
		match := t.Matches[k]
		for i := 0; i < match.MatchType.Overs(); i++ {
			fmt.Println("Playing Over : ", i+1)
			over := domain.NewOver(i + 1)
			// Play the over
			for j := 0; j < 6; j++ {
				Ball := domain.PlayBall(over, j+1)
				gs.UpdateScoreBoard(match, Ball)
			}
		}
	}
}

func (gs *GameService) UpdateScoreBoard(match *domain.Match, bal *domain.Ball) {
	CurrentScoreboard := len(match.ScoreBoard.MatchSCBoard) - 1
	inningsScoreCard := match.ScoreBoard.MatchSCBoard[CurrentScoreboard]
	Batsmen := inningsScoreCard.StrikingBatsMen
	Bowler := inningsScoreCard.CurrentBowler
	// Update the scoreboard
	inningsScoreCard.InningsScore += bal.RunsScored
	// Update the bowler scoreboard
	if bal.IsWicket {
		inningsScoreCard.InningsTotalWickets += 1
		inningsScoreCard.BowlingScoreBoard[Bowler].WicketsTaken += 1
		inningsScoreCard.BattingScoreBoard[Batsmen].BowledBy = Bowler
	}
	// Update the batsmen scoreboard
	inningsScoreCard.BattingScoreBoard[Batsmen].RunsScored += bal.RunsScored
	inningsScoreCard.BattingScoreBoard[Batsmen].BallsPlayed += 1
}
