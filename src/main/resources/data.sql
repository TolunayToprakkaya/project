INSERT INTO T_CUSTOMER (id, username, name, surname, password) VALUES ('EC444374-A6D9-4B78-BB4A-A26FB3B90D28', 'metintoprakkaya'   , 'metin'   , 'toprakkaya' , 'mt123' );
INSERT INTO T_CUSTOMER (id, username, name, surname, password) VALUES ('cee9a576-4722-11e8-842f-0ed5f89f718b', 'tolunaytoprakkaya' , 'tolunay' , 'toprakkaya' , 'tt123'  );

INSERT INTO T_PRODUCT (id, name, part, overhaul_date, customer_id) VALUES ('cee9aa58-4722-11e8-842f-0ed5f89f718b', 'Bilgisayar' , 0 , '2018-10-31 00:00:00' , 'EC444374-A6D9-4B78-BB4A-A26FB3B90D28' );
INSERT INTO T_PRODUCT (id, name, part, overhaul_date, customer_id) VALUES ('cee9abc0-4722-11e8-842f-0ed5f89f718b', 'Televizyon' , 0 , '2018-10-31 00:00:00' , 'cee9a576-4722-11e8-842f-0ed5f89f718b' );
INSERT INTO T_PRODUCT (id, name, part, overhaul_date, customer_id) VALUES ('cee9acf6-4722-11e8-842f-0ed5f89f718b', 'Telefon'    , 0 , '2018-10-31 00:00:00' , 'EC444374-A6D9-4B78-BB4A-A26FB3B90D28' );
INSERT INTO T_PRODUCT (id, name, part, overhaul_date, customer_id) VALUES ('cee9ae22-4722-11e8-842f-0ed5f89f718b', 'Kombi'      , 0 , '2018-10-31 00:00:00' , 'cee9a576-4722-11e8-842f-0ed5f89f718b' );

INSERT INTO T_PROCESS (id, customer_id, product_id) VALUES ('f6f64840-865f-4da7-b4ae-826772313925' , 'EC444374-A6D9-4B78-BB4A-A26FB3B90D28' , 'cee9aa58-4722-11e8-842f-0ed5f89f718b'  );
INSERT INTO T_PROCESS (id, customer_id, product_id) VALUES ('86ef6062-6eac-4e44-bef4-61b4490c347f' , 'cee9a576-4722-11e8-842f-0ed5f89f718b' , 'cee9abc0-4722-11e8-842f-0ed5f89f718b'  );
INSERT INTO T_PROCESS (id, customer_id, product_id) VALUES ('ae76133c-3c53-4c19-9a71-f2362546af36' , 'EC444374-A6D9-4B78-BB4A-A26FB3B90D28' , 'cee9acf6-4722-11e8-842f-0ed5f89f718b'  );
INSERT INTO T_PROCESS (id, customer_id, product_id) VALUES ('ce4dfcbd-6312-4ef8-bd18-59778865b7b4' , 'cee9a576-4722-11e8-842f-0ed5f89f718b' , 'cee9ae22-4722-11e8-842f-0ed5f89f718b'  );
