-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

INSERT INTO paciente (nome, dataNascimento, cpf, telefone, numeroCartaoSus) VALUES 
        ('Joao Silva', '2000-03-22', '067-050-561-41', '6394562-5944', '151511551652262'),
        ('Maria Rosa', '2005-10-22', '031-110-561-21', '6296879-4877','798534895782432'),
        ('Pedro Chaves', '2021-12-22', '421-352-135-31', '567389-5498','56473892029832');

INSERT INTO remedio (nome, intervalo, dosagem, indicacao, dataValidadeReceita) VALUES 
        ('Metformina', '8 em 8 horas', '500mg', 'Tomar com alimentos', '2024-11-14'),
        ('Remedio 2', '4 em 4 horas', '250mg', 'Tomar com sozinho', '2024-11-14'),
        ('Remedio 3', '2 em 2 horas', '100mg', 'Tomar com agua', '2024-11-14'),
        ('Remedio 4', '1 em 1 horas', '50mg', 'Tomar sozinho', '2024-11-14');

INSERT INTO pressaoArterial (medidaAfericao, dataCadastro) VALUES
        ('120/80 mmHg', '2024-02-14 22:30:00'),
        ('140/100 mmHg', '2024-06-14 10:30:00'),
        ('130/90 mmHg', '2024-06-08 17:30:00');

INSERT INTO diabete (medidaAfericao, dataCadastro) VALUES
        ('130 mg/dl', '2024-06-14 22:30:00'),
        ('140 mg/dl', '2024-10-14 12:30:00'),
        ('150 mg/dl', '2024-05-14 09:30:00');

INSERT INTO sintoma (titulo, descricao, dataCadastro) VALUES 
        ('Dor de cabeca', 'Senti uma dor de cabeca apos levantar', '2024-06-18 23:59:59'),
        ('Dor no coracao', 'Estava estudando e senti uma dor no coracao', '2023-02-18 15:20:59');

INSERT INTO consulta (dataConsulta, nomePaciente, local, motivo) VALUES 
        ('2022-06-10', 'Pedro Otavio', '504 Sul Alameda 14', 'Pressao baixa'),
        ('2021-12-25', 'Pedro Otavio', '504 Sul Alameda 14', 'Pressao alta'),
        ('2023-10-14', 'Pedro Otavio', '504 Sul Alameda 14', 'Pressao alta'),
        ('2024-10-25', 'Pedro Otavio', '504 Sul Alameda 14', 'Pressao baixa');

        