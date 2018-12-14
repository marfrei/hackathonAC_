DELETE FROM user;
INSERT INTO user(ID, CREATIONTIME, UPDATETIME, VERSION, USERNAME, PASSWORD, NAME, EMAIL) VALUES
  (1, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0, 'rferrão', 'academia', 'Rui Ferrão', 'mail@gmail.com'),
  (2, TIMESTAMP '2017-10-10 08:45:56.481', TIMESTAMP '2017-10-10 08:45:56.481', 0, 'sgouveia', 'academia','Sérgio Gouveia', 'mail@gmail.com'),
  (3, TIMESTAMP '2017-10-10 08:45:56.482', TIMESTAMP '2017-10-10 08:45:56.482', 0, 'bferreira', 'academia', 'Bruno Ferreira', 'mail@gmail.com')

DELETE FROM institution;
INSERT INTO institution(ID, CREATIONTIME, UPDATETIME, VERSION, NAME, ADDRESS, SITEURL,EMAIL, DESCRIPTION) VALUES
  (1, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 'Santa Casa da Misericórdia do Porto', 'Rua Joaquim Vasconcelos, 79 4050-311 Porto', 'https://www.scmp.pt/pt-pt/instituicao/instituicao-homepage', 'scmp@scmp.pt', 'A Santa Casa da Misericórdia do Porto, constituída na Ordem Jurídica Canónica, é uma instituição de caridade e assistência social, de fins filantrópicos e de utilidade pública.

Na atualidade, a sua ação assenta nas seguintes áreas: Intervenção Social, Saúde, Ensino Especial, Educação, Cultura, Culto, Ambiente e Projetos Especiais. Pelo número de estabelecimentos e de utentes, pelo vasto e valioso património, pela sua digna e proeminente história, a Misericórdia do Porto é a segunda mais antiga e também uma das mais importantes.')