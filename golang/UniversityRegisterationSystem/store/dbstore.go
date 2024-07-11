package store

import (
	"domain"
	"sync"
)

type UniversityStore interface {
	AddStudentToCourse(st *domain.Student, cs *domain.Course) error
	GetAllCourses(st *domain.Student) error
}

type CourseRepository struct {
	sync.Mutex
	couseStore map[string]*domain.Course
}
type StudentRepository struct {
	sync.Mutex
	studentStore map[string]*domain.Student
}

type DBStore struct {
	st *StudentRepository
	ct *CourseRepository
}

func NewStore() *DBStore {
	return &DBStore{
		ct: &CourseRepository{
			couseStore: make(map[string]*domain.Course),
		},
		st: &StudentRepository{
			studentStore: make(map[string]*domain.Student),
		},
	}
}

func (us *DBStore) AddStudentToCourse(student *domain.Student, course *domain.Course) {
	us.st.Lock()
	defer us.st.Unlock()
	student, ok := us.st.studentStore[student.Id]
	if ok {
		student.Courses.AddCourse(course)
	}

}

func (us *DBStore) GetAllCourses(student *domain.Student) []domain.Course {
	us.st.Lock()
	defer us.st.Unlock()
	stud, _ := us.st.studentStore[student.Id]
	return stud.Courses
}
