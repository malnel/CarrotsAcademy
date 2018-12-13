#Inicjalizacja postgres w dockerze 

	Baza bookee z tabelą book.
	Dla 1 i 2 używamy init_postgres_db_and_user.sql
	Dla 3 i 4 używamy init_postgres_db_and_user_hibernate

##1. Zainstalowanie Docker


##2. Kontener z bazą postgres
	docker run -d --name postgress_with_bookee -p 5432:5432 -e POSTGRES_PASSWORD=my_pass postgres

##3. Skopiowanie pliku do kontenera
	docker cp ./init_postgres_db_and_user.sql postgress_with_bookee:/opt/init_postgres_db_and_user.sql

##4. Uruchomienie skryptu w kontenerze
	docker exec postgress_with_bookee psql -U postgres -f /opt/init_postgres_db_and_user.sql

