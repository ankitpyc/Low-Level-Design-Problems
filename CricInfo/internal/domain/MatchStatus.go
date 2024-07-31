package domain

type MatchStatus int
type MatchType int

const (
	FINISHED MatchStatus = iota
	ABANDONED
	INPROGRESS
	TIE
	RAIN_DELAYED
)

const (
	T20 MatchType = iota
	TestCricket
	OneDay
)

var matchTypeToOvers = map[MatchType]int{
	TestCricket: 0,  // Test matches do not have a limited number of overs
	OneDay:      50, // One-Day matches have 50 overs
	T20:         20, // T20 matches have 20 overs
}

func (m MatchType) Overs() int {
	return matchTypeToOvers[m]
}
