-- Insert data into the member table
INSERT INTO member (id, image, nickname)
VALUES (1, 'http://example.com/image1.jpg', 'JohnDoe'),
       (2, 'http://example.com/image2.jpg', 'JaneDoe');

-- Insert data into the travel table
INSERT INTO travel (id, end_at, start_at, description, thumbnail, title)
VALUES (1, '2023-07-30', '2023-07-20', 'Summer vacation to the beach', 'http://example.com/thumbnail1.jpg',
        'Beach Vacation'),
       (2, '2023-08-15', '2023-08-05', 'Mountain hiking trip', 'http://example.com/thumbnail2.jpg', 'Mountain Hike');

-- Insert data into the visit table
INSERT INTO visit (id, visited_at, travel_id, address, image, place_name)
VALUES (1, '2023-07-21', 1, '123 Beach Ave', 'http://example.com/visit1.jpg', 'Sunny Beach'),
       (2, '2023-08-06', 2, '456 Mountain Rd', 'http://example.com/visit2.jpg', 'Rocky Mountain');

-- Insert data into the comment table
INSERT INTO comment (id, member_id, visit_id, content)
VALUES (1, 1, 1, 'Had a great time at the beach!'),
       (2, 2, 2, 'The mountain hike was challenging but rewarding.');

-- Insert data into the travel_mate table
INSERT INTO travel_mate (member_id, travel_id)
VALUES (1, 1),
       (2, 1),
       (1, 2),
       (2, 2);
