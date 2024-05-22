CREATE TABLE years (
                       id_year SERIAL PRIMARY KEY,
                       cycle VARCHAR(100) NOT NULL,
                       academic_year INT NOT NULL,
                       semester INT NOT NULL

);

CREATE TABLE groups (
                        id_group SERIAL PRIMARY KEY,
                        name     VARCHAR(100) NOT NULL
);

CREATE TABLE subjects (
                          id_subject SERIAL PRIMARY KEY,
                          name_subject VARCHAR(100) NOT NULL,
                          year_id INT NOT NULL,
                          FOREIGN KEY (year_id) REFERENCES years(id_year)

);

CREATE TABLE students (
                          id_student SERIAL PRIMARY KEY,
                          name VARCHAR(100) NOT NULL,
                          year_id INT NOT NULL,
                          group_id INT NOT NULL,
                          grade DOUBLE PRECISION NOT NULL,
                          subject_id INT NOT NULL,
                          FOREIGN KEY (year_id) REFERENCES years(id_year),
                          FOREIGN KEY (group_id) REFERENCES groups(id_group),
                          FOREIGN KEY (subject_id) REFERENCES subjects(id_subject)

);

CREATE TABLE userAccount (
        id SERIAL PRIMARY KEY,
        username VARCHAR(100) NOT NULL,
        password VARCHAR(100) NOT NULL
);

