-- Insert members
INSERT INTO member (id, image, nickname)
VALUES (1, 'https://example.com/images/alice_profile.jpg', '카고');
INSERT INTO member (id, image, nickname)
VALUES (2, 'https://example.com/images/bob_profile.jpg', '리니');
INSERT INTO member (id, image, nickname)
VALUES (3, 'https://example.com/images/charlie_profile.jpg', '폭포');
INSERT INTO member (id, image, nickname)
VALUES (4, 'https://example.com/images/dave_profile.jpg', '빙티');
INSERT INTO member (id, image, nickname)
VALUES (5, 'https://example.com/images/ellen_profile.jpg', '호티');
INSERT INTO member (id, image, nickname)
VALUES (6, 'https://example.com/images/frank_profile.jpg', '해나');
INSERT INTO member (id, image, nickname)
VALUES (7, 'https://example.com/images/grace_profile.jpg', '호두');

-- Insert travels
INSERT INTO travel (id, start_at, end_at, description, thumbnail, title)
VALUES (1, '2023-07-01', '2023-07-10', '친구들과 함께한 여름 휴가 여행', 'https://example.com/images/summer_vacation.jpg',
        '2023 여름 휴가'),
       (2, '2023-10-15', '2023-10-20', '가을 단풍 여행', 'https://example.com/images/autumn_trip.jpg', '2023 가을 단풍 여행'),
       (3, '2023-12-01', '2023-12-05', '겨울 스키 여행', 'https://example.com/images/winter_trip.jpg', '2023 겨울 스키 여행'),
       (4, '2023-03-20', '2023-03-25', '봄꽃 축제 여행', 'https://example.com/images/spring_trip.jpg', '2023 봄꽃 축제 여행'),
       (5, '2023-05-10', '2023-05-15', '해변 여행', 'https://example.com/images/beach_trip.jpg', '2023 해변 여행');

-- Insert travel_mate relationships
INSERT INTO travel_mate (travel_id, member_id)
VALUES (1, 1),
       (1, 2),
       (1, 3),
       (2, 4),
       (2, 5),
       (2, 6),
       (2, 7),
       (3, 1),
       (3, 4),
       (3, 5),
       (4, 2),
       (4, 3),
       (4, 6),
       (5, 1),
       (5, 7);

-- Insert visits
INSERT INTO visit (id, travel_id, visited_at, address, image, place_name)
VALUES (1, 1, '2023-07-02', '대한민국 서울특별시 용산구 남산공원길 105', 'https://example.com/images/namsan_tower.jpg', '남산 서울타워'),
       (2, 1, '2023-07-03', '대한민국 서울특별시 종로구 사직로 161', 'https://example.com/images/gyeongbokgung.jpg', '경복궁'),
       (3, 2, '2023-10-16', '대한민국 강원도 평창군 대관령면 오목길 70', 'https://example.com/images/daegwallyeong.jpg', '대관령'),
       (4, 2, '2023-10-18', '대한민국 경기도 가평군 청평면 상천리 111', 'https://example.com/images/namiseom.jpg', '남이섬'),
       (5, 3, '2023-12-02', '대한민국 강원도 평창군 봉평면', 'https://example.com/images/pyeongchang.jpg', '평창 스키장'),
       (6, 3, '2023-12-04', '대한민국 강원도 정선군', 'https://example.com/images/jungseon.jpg', '정선 스키장'),
       (7, 4, '2023-03-21', '대한민국 제주도 서귀포시', 'https://example.com/images/jeju.jpg', '제주도 벚꽃 축제'),
       (8, 4, '2023-03-23', '대한민국 진해시', 'https://example.com/images/jinhae.jpg', '진해 군항제'),
       (9, 5, '2023-05-11', '대한민국 부산 해운대구', 'https://example.com/images/haeundae.jpg', '해운대 해수욕장'),
       (10, 5, '2023-05-13', '대한민국 제주도 서귀포시', 'https://example.com/images/jeju_beach.jpg', '중문 해수욕장');

-- Insert comments for visits
INSERT INTO comment (id, member_id, visit_id, content)
VALUES (1, 1, 1, '도시의 멋진 전망! 서울에서 꼭 가봐야 할 곳입니다.'),
       (2, 2, 1, '타워까지 올라가는 케이블카가 정말 좋았어요.'),
       (3, 3, 1, '특히 일몰 시간에 사진 찍기 좋은 장소입니다.'),
       (4, 4, 3, '가을 단풍이 정말 아름다웠어요.'),
       (5, 5, 3, '대관령에서의 하이킹이 정말 인상적이었어요.'),
       (6, 6, 4, '남이섬의 가을 풍경이 환상적이었어요.'),
       (7, 7, 4, '섬에서의 산책이 정말 평화로웠어요.'),
       (8, 1, 5, '스키 타는 재미가 최고였어요!'),
       (9, 4, 5, '겨울 스포츠를 즐기기에 딱 좋은 곳이에요.'),
       (10, 5, 6, '정선의 경치가 아름다웠습니다.'),
       (11, 2, 7, '제주도의 벚꽃이 만개했어요! 정말 예뻤습니다.'),
       (12, 3, 7, '벚꽃 아래에서의 산책이 최고였어요.'),
       (13, 6, 8, '진해 군항제에서 벚꽃 구경이 정말 멋졌어요.'),
       (14, 1, 9, '해운대 해변에서의 휴식이 정말 좋았어요.'),
       (15, 7, 9, '부산의 바다가 정말 아름다웠습니다.'),
       (16, 1, 10, '제주도의 해변은 언제나 최고입니다.'),
       (17, 7, 10, '중문 해수욕장에서의 여유로운 시간이 좋았어요.');
