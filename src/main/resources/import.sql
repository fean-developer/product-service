
INSERT INTO categories (name, description) VALUES  ('Ferragens', 'Ferragens para decoração');
INSERT INTO categories (name, description) VALUES  ('Vasos', 'Vasos para decoração');
INSERT INTO categories (name, description) VALUES  ('Rocamboleiras', 'Rocamboleiras para decoração');

INSERT INTO vendors (name, email, phone, cnpj) VALUES ('Loja Sara Decoracoes', 'vendas@saradecoracoes.com.br', '11 9999-9999', '010101010000199');

INSERT INTO product (code,internal_code, vendor_code, name, color, size, unit_value,active, deleted, stock, description, image, category_id, vendor_id, created_at, updated_at) VALUES ('7377c565-6f0e-4325-a120-d94b07282e93','FL459', 'vendorCode1', 'Arco Romano Janela', 'color1', 'size1', 380.0,  true, false, 5, 'description1', 'image1', 1, 1,now(),now());
INSERT INTO product (code,internal_code, vendor_code, name, color, size, unit_value,active, deleted, stock, description, image, category_id, vendor_id, created_at, updated_at) VALUES  ( '96f0f334-270d-4f50-9064-db87f372281b','FD010', 'vendorCode2', 'Taça Grega G', 'color2', 'size2', 45.0, true, false, 4, 'description2', 'image2', 3, 1,now(),now());
INSERT INTO product (code,internal_code, vendor_code, name, color, size, unit_value,active, deleted, stock, description, image, category_id, vendor_id, created_at, updated_at) VALUES  ('2f7979e7-d143-46b1-8fc5-7fbdddd1f17a','FD012', 'vendorCode3', 'Vazo Bola Pé Quadrado', 'color3', 'size3', 42.0, true, false, 5, 'description3', 'image3', 3, 1,now(),now());
INSERT INTO product (code,internal_code, vendor_code, name, color, size, unit_value,active, deleted, stock, description, image, category_id, vendor_id, created_at, updated_at) VALUES  ( '822a5702-8abd-42a8-a5c4-c870f38041b0','FD014', 'vendorCode4', 'Vaso Diamante Fino', 'color4', 'size4', 45.0, true, false, 5, 'description4', 'image4', 3, 1,now(),now()) ;
INSERT INTO product (code,internal_code, vendor_code, name, color, size, unit_value,active, deleted, stock, description, image, category_id, vendor_id, created_at, updated_at) VALUES  ( 'c003b573-4644-465a-879a-4add34a6558a','FD018', 'vendorCode5', 'Vaso Riscado', 'color5', 'size5', 48.0,  true, false, 5, 'description5', 'image5', 3, 1,now(),now());
INSERT INTO product (code,internal_code, vendor_code, name, color, size, unit_value,active, deleted, stock, description, image, category_id, vendor_id, created_at, updated_at) VALUES  ('38676507-5974-4d48-9d10-7629b5c5afd1', 'FD019', 'vendorCode6', 'Vaso Portal Redondo', 'color6', 'size6', 42.0,true, false, 5, 'description6', 'image6', 3, 1 ,now(),now());

--create insert for table product
