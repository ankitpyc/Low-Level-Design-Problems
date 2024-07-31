package database

import (
	"sync"
)

var dbInstance *Database = nil
var lock = &sync.Mutex{}

type Database struct {
	DB map[string]interface{}
}

func GetDB() *Database {
	if dbInstance == nil {
		lock.Lock()
		defer lock.Unlock()
		if dbInstance == nil {
			dbInstance = &Database{
				DB: make(map[string]interface{}),
			}
		}
	}
	return dbInstance
}

func (db *Database) Save(key string, value interface{}) {
	db.DB[key] = value
}

func (db *Database) Delete(key string) {
	delete(db.DB, key)
}

func (db *Database) Get(key string) interface{} {
	return db.DB[key]
}
