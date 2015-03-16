INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'Ketones(Urine)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'Blood(Urine)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'Bilirubin(Urine)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'Nitrite(Urine)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'T. vaginalis(Genital Swab)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'Yeast Cells(Genital Swab)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'HIV Rapid Test - First Response(Blood)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'HIV Rapid Test - Uni-Gold(Blood)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'HIV EIA(Blood)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'HIV Antigen Test(Blood)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'Measles(Blood)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'Rubella(Blood)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'Rapid Plasma Reagin(Blood)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'TPHA(Blood)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'ASO Test(Blood)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'Salmonella antigen test(Stool)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'Salmonella antigen test(Blood)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'Widal test(Blood)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'Brucella test(Blood)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'Rheumatoid Factor Tests(Blood)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'Cryptococcal Antigen(Blood)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'Cryptococcal Antigen(CSF)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'Helicobacter pylori test(Stool)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'Hepatitis A Test(Blood)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'Hepatitis B Test(Blood)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'Hepatitis C Test(Blood)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'G6PD screening(Blood)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'Early infant diagnosis HIV PCR(Dried Blood Spots)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Negative' ) );
INSERT INTO clinlims.result_limits(  id, test_id, test_result_type_id, lastupdated, normal_dictionary_id) 
	 VALUES ( nextval( 'clinlims.result_limits_seq' ) , ( select id from clinlims.test where description = 'Hepatitis C Qualitative PCR(Blood)' ) , (select id from clinlims.type_of_test_result where test_result_type = 'D' ) ,  now() , (select max(id) from clinlims.dictionary where dict_entry = 'Indetectable' ) );
