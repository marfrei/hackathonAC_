DELETE FROM user;
INSERT INTO user(ID, CREATIONTIME, UPDATETIME, VERSION, USERNAME, PASSWORD, NAME, EMAIL) VALUES
  (1, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0, 'rferrão', 'academia', 'Rui Ferrão', 'mail@gmail.com'),
  (2, TIMESTAMP '2017-10-10 08:45:56.481', TIMESTAMP '2017-10-10 08:45:56.481', 0, 'sgouveia', 'academia','Sérgio Gouveia', 'mail@gmail.com'),
  (3, TIMESTAMP '2017-10-10 08:45:56.482', TIMESTAMP '2017-10-10 08:45:56.482', 0, 'bferreira', 'academia', 'Bruno Ferreira', 'mail@gmail.com')

DELETE FROM institution;
INSERT INTO institution(ID, CREATIONTIME, UPDATETIME, VERSION, NAME, ADDRESS, SITEURL,EMAIL, DESCRIPTION) VALUES
  (1, timestamp '2017-10-10 10:18:53.819', timestamp '2017-10-10 10:22:58.578', 0, 'santa casa da misericórdia do porto', 'rua joaquim vasconcelos, 79 4050-311 porto', 'https://www.scmp.pt/pt-pt/instituicao/instituicao-homepage', 'scmp@scmp.pt', 'a santa casa da misericórdia do porto, constituída na ordem jurídica canónica, é uma instituição de caridade e assistência social, de fins filantrópicos e de utilidade pública.');

