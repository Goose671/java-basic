
CREATE DATABASE my_database;

CREATE TABLE IF NOT EXISTS students (
    id SERIAL PRIMARY KEY,
    surname VARCHAR(50),
    name VARCHAR(50),
    patronymic VARCHAR(50),
    dob DATE,          -- дата народження
    z_book VARCHAR(50) -- номер залікової книжки
    );

INSERT INTO students (surname, name, patronymic, dob, z_book) VALUES
('Петренко', 'Іван', 'Миколайович', '2000-01-10', 'ZB001'),
('Шевченко', 'Олег', 'Петрович', '2001-02-05', 'ZB002'),
('Коваль', 'Юрій', 'Ігорович', '1999-03-25', 'ZB003'),
('Василенко', 'Максим', 'Олександрович', '2002-04-30', 'ZB004'),
('Гнатюк', 'Павло', 'Олегович', '2001-05-12', 'ZB005'),
('Бойко', 'Дмитро', 'Андрійович', '1998-07-04', 'ZB006'),
('Мельник', 'Ігор', 'Сергійович', '2000-08-15', 'ZB007'),
('Савченко', 'Андрій', 'Павлович', '2001-09-09', 'ZB008'),
('Прокопенко', 'Святослав', 'Іванович', '2002-10-21', 'ZB009'),
('Ткаченко', 'Віктор', 'Вікторович', '1999-11-11', 'ZB010'),
('Романенко', 'Олександр', 'Ігорович', '2000-12-31', 'ZB011'),
('Федоренко', 'Ілля', 'Богданович', '2002-01-18', 'ZB012'),
('Сидоренко', 'Володимир', 'Максимович', '1999-02-27', 'ZB013'),
('Самойленко', 'Артем', 'Аркадійович', '2000-03-07', 'ZB014'),
('Гордієнко', 'Денис', 'Леонідович', '1998-04-02', 'ZB015'),
('Задорожний', 'Олексій', 'Григорович', '2001-05-29', 'ZB016'),
('Соловей', 'Тарас', 'Дмитрович', '2002-07-17', 'ZB017'),
('Кучма', 'Іван', 'Сергійович', '1999-08-24', 'ZB018'),
('Мазур', 'Петро', 'Миколайович', '2002-09-10', 'ZB019'),
('Козак', 'Роман', 'Олександрович', '2000-10-22', 'ZB020');
