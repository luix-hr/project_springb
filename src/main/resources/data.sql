INSERT INTO TB_USER(name, email, password) VALUES('Aluno', 'aluno@email.com', '123456');

INSERT INTO TB_COURSE(name, category) VALUES('Spring Boot', 'Programação');
INSERT INTO TB_COURSE(name, category) VALUES('HTML 5', 'Front-end');

INSERT INTO TB_TOPICS(date_create, message, status, title, course_id, user_id)
VALUES('2019-05-05 18:00:00', 'Erro ao criar projeto', 'NON_ANSWER', 'Dúvida', 1, 1)
,('2019-05-05 19:00:00', 'Projeto não compila', 'NON_ANSWER', 'Dúvida 2', 1, 1)
,('2019-05-05 20:00:00', 'Tag HTML', 'NON_ANSWER', 'Dúvida 3', 2, 1);