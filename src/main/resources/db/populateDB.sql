DELETE FROM votes;
DELETE FROM user_roles;
DELETE FROM meals;
DELETE FROM users;
DELETE FROM restaurants;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (name, email, password)
VALUES ('User1', 'user1@yandex.ru', 'password'),
       ('User2', 'user2@mail.ru', 'pass'),
       ('Admin1', 'admin@gmail.com', 'admin');

INSERT INTO restaurants (name)
VALUES ('Restaurant1'),
       ('Restaurant2');

INSERT INTO user_roles (role, user_id)
VALUES ('USER', 100000),
       ('USER', 100001),
       ('ADMIN', 100002);

INSERT INTO meals(name, price, date, restaurant_id)
VALUES ('Meal1', 2.2, '2020-07-07', 100003),
       ('Meal2', 3.3, '2020-07-07', 100003),
       ('Meal3', 4.4, '2020-07-07', 100004);

INSERT INTO votes(date_time, user_id, restaurant_id)
VALUES ('2020-07-07 10:00:00', 100000, 100003),
       ('2020-07-07 11:00:00', 100001, 100004);
