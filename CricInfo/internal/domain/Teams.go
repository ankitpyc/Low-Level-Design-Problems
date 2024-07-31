package domain

type TeamName int

const (
	INDIA TeamName = iota
	NewZealand
	Pakistan
	England
	SouthAfrica
)

type Team struct {
	Name        TeamName
	Players     []*Player
	MatchesWon  int
	MatchesLost int
}
