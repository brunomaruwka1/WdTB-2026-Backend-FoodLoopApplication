-- Dane startowe aplikacji. Tabele tworzy Hibernate z encji, a ten plik Spring Boot uruchamia zaraz potem.
-- LAB 01: dopiszcie tu konta wszystkich osób z zespołu (reguła R1.03).
-- LAB 02: dopiszcie dane do swoich tabel (kolejność: najpierw tabele, na które wskazują klucze obce).
insert into user_account (email, display_name, role, created_at) values
    ('s902258@student.wroclaw.merito.pl',   'Jeremiasz',   'USER',    current_timestamp),
    ('s692545@student.wroclaw.merito.pl',  'Bruno',  'USER',    current_timestamp),
    ('indeks@student.wroclaw.merito.pl',  'Anonim',  'USER',    current_timestamp);
-- LAB 01: Wasze konta (zmieńcie na swoje dane, rola USER)
-- insert into user_account (email, display_name, role, created_at) values
--     ('imie.nazwisko@student.merito.pl', 'Imię', 'USER', current_timestamp);
-- LAB 02 · food_offer
insert into food_offer (name, description, price, quantity, pickup_deadline, status) values
    ('Plon', 'Zestaw słodkości mix', 21.99, 5, '2026-11-06 18:00:00', 'AVAILABLE'),
    ('Chleboteka', 'Zestaw croissantów', 25.99, 3, '2026-11-06 19:00:00', 'AVAILABLE'),
    ('Gniazdo', 'Paczka - ciasta', 19.99, 0, '2026-11-06 17:00:00', 'SOLD_OUT');

-- LAB 02 · reservation
insert into reservation (customer_name, customer_email, quantity, reservation_date, status) values
    ('Adam Orzeł', 'adamo@gmail.com', 1, '2026-11-16 10:30:00', 'CONFIRMED'),
    ('Anna Nowacka', '22anna@vp.pl', 2, '2026-11-16 11:15:00', 'PENDING'),
    ('Piotr Wisniakiewicz', 'piotrula123@wp.pl', 1, '2026-11-16 12:00:00', 'COMPLETED');

-- LAB 02 · pickup
insert into pickup (pickup_date, pickup_code, customer_name, confirmed, street, city, postal_code, country) values
   ('2026-11-16 17:00:00', 'FL001', 'Adam Orzeł', true, 'Strachocińska 166', 'Wroclaw', '51-518', 'Poland'),
   ('2026-11-16 18:00:00', 'FL002', 'Anna Nowak', false, 'Ruska 64/65', 'Wroclaw', '50-079', 'Poland'),
   ('2026-11-16 19:00:00', 'FL003', 'Piotr Wisniewski', true, 'Świdnicka 36', 'Wroclaw', '50-068', 'Poland');