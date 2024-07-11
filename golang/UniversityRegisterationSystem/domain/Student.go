package domain

type Student struct {
	Person
	Courses []Course
}

func NewStudent(Name string, Email string) *Student {
	return &Student{
		Courses: make([]Course, 0),
	}
	Student.Name = Name
	Student.Email = Email
}
