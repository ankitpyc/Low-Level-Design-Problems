package domain

import (
	"math/rand"
)

const (
	MAX_SCORE = 6
	MIN_SCORE = -1
)

type Overs struct {
	overno int
	balls  []*Ball
}

func NewOver(overno int) *Overs {
	return &Overs{
		overno: overno,
		balls:  make([]*Ball, 0),
	}
}

func PlayBall(over *Overs, ballNo int) *Ball {
	bal := &Ball{
		ballNo:     ballNo,
		isFours:    false,
		isSixes:    false,
		IsWicket:   false,
		RunsScored: 0,
	}
	over.balls = append(over.balls, bal)
	score := rand.Intn(MAX_SCORE-MIN_SCORE) + MIN_SCORE
	HandleBall(bal, score)
	return bal
}

func HandleBall(ball *Ball, score int) int {
	switch score {
	case -1:
		ball.IsWicket = true
		ball.RunsScored = 0
	case 4:
		ball.isFours = true
		ball.RunsScored = 4
	case 6:
		ball.isSixes = true
		ball.RunsScored = 6
	default:
		ball.RunsScored = score
	}
	return ball.RunsScored
}

type Ball struct {
	ballNo     int
	IsWicket   bool
	RunsScored int
	isFours    bool
	isSixes    bool
}
