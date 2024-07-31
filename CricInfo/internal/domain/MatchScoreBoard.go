package domain

type MatchScoreBoard struct {
	MatchSCBoard []*InningsScoreBoard
}

type InningsScoreBoard struct {
	BattingTeamName     TeamName
	BowlingTeamName     TeamName
	Teams               []*Team
	StrikingBatsMen     string
	NonStrikeBatsMen    string
	InningsScore        int
	InningsTotalWickets int
	isInningsOver       bool
	CurrentBowler       string
	BattingScoreBoard   map[string]*ScoreBoardEntry
	BowlingScoreBoard   map[string]*ScoreBoardEntry
}

func (isb *InningsScoreBoard) UpdateInningsScoreBoard(ball *Ball) {
	if ball.IsWicket {
		isb.BattingScoreBoard[isb.StrikingBatsMen].BowledBy = isb.CurrentBowler
		isb.BowlingScoreBoard[isb.CurrentBowler].WicketsTaken++
		isb.InningsTotalWickets++
		ChangeBatsmen(ball, isb)
		return
	} else if ball.isFours {
		isb.BattingScoreBoard[isb.StrikingBatsMen].NoOfFours++
	} else if ball.isSixes {
		isb.BattingScoreBoard[isb.StrikingBatsMen].NoOfSixes++
	}
}

func ChangeBatsmen(ball *Ball, isb *InningsScoreBoard) {
	if ball.IsWicket {
		if isb.InningsTotalWickets == 10 {
			isb.isInningsOver = true
		}
	} else {
		temp := isb.StrikingBatsMen
		isb.StrikingBatsMen = isb.NonStrikeBatsMen
		isb.NonStrikeBatsMen = temp
	}
}

type ScoreBoardEntry struct {
	PlayerName   string
	RunsScored   int
	WicketsTaken int16
	BallsPlayed  int16
	OversBowled  float32
	BowledBy     string
	NoOfSixes    int16
	NoOfFours    int16
}

func CreateScoreBoard() *MatchScoreBoard {
	return &MatchScoreBoard{
		MatchSCBoard: make([]*InningsScoreBoard, 0),
	}
}
