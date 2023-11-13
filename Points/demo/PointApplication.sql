DROP TABLE IF EXISTS user_app, merchant, airline, cc_reward_program, airport, user_cc_program, airline_cc_program, reward_flight;

CREATE TABLE user_app 
(
	user_id SERIAL,
	user_name VARCHAR(120) NOT NULL,
	email VARCHAR(80) NOT NULL,
	
	CONSTRAINT pk_user_app PRIMARY KEY (user_id)
);

CREATE TABLE merchant
(
	merchant_id SERIAL,
	merchant_name VARCHAR(120),
	
	CONSTRAINT pk_merchant PRIMARY KEY (merchant_id)
);

CREATE TABLE airline
(
	airline_iata_code VARCHAR(8) NOT NULL,
	airline_name VARCHAR(40) NOT NULL,
	
	CONSTRAINT pk_airline PRIMARY KEY(airline_iata_code)
	
);

CREATE TABLE cc_reward_program
(
	cc_program_id SERIAL,
	merchant_given_product_code VARCHAR(80) NOT NULL,
	merchant_id INT,

	CONSTRAINT pk_program PRIMARY KEY(cc_program_id),
	CONSTRAINT fk_program_merchant FOREIGN KEY (merchant_id) REFERENCES merchant(merchant_id)
		
);

CREATE TABLE airport
(
	airport_iata_code VARCHAR(8) NOT NULL,
	airport_name VARCHAR(50) NOT NULL,
	address VARCHAR(360) NOT NULL,
	latitude_longitude VARCHAR(40) NOT NULL,
	image_city VARCHAR(240),
	
	CONSTRAINT pk_airport PRIMARY KEY (airport_iata_code)
	
);

CREATE TABLE reward_flight
(
	flight_id SERIAL,
	points_price INT,
	departure_time TIMESTAMP NOT NULL,
	arrival_time TIMESTAMP NOT NULL,
	origin_airport_id VARCHAR(8) NOT NULL,
	destination_airport_id VARCHAR(8) NOT NULL,
	airline_id VARCHAR(8) NOT NULL,
	
	CONSTRAINT pk_flight PRIMARY KEY (flight_id),
	CONSTRAINT fk_flight_origin_airport FOREIGN KEY (origin_airport_id) REFERENCES airport(airport_iata_code),
	CONSTRAINT fk_flight_dest_airport FOREIGN KEY (destination_airport_id) REFERENCES airport(airport_iata_code),
	CONSTRAINT fk_flight_airline FOREIGN KEY (airline_id) REFERENCES airline(airline_iata_code)
);

CREATE TABLE user_cc_program
(
	user_id INT NOT NULL,
	cc_program_id INT NOT NULL,
	
	CONSTRAINT pk_user_program PRIMARY KEY(user_id, cc_program_id)
	
);

CREATE TABLE airline_cc_program
(
	airline_iata_code VARCHAR(8) NOT NULL,
	program_code VARCHAR(8) NOT NULL,
	CONSTRAINT pk_airline_program PRIMARY KEY(airline_iata_code, program_code)
);

CREATE TABLE point_exchangerate (
    point_exchangerateId SERIAL PRIMARY KEY,
    from_merchant_id INT NOT NULL REFERENCES merchant(merchant_id),
    to_merchant_id INT NOT NULL REFERENCES merchant(merchant_id),
    rate_date DATE NOT NULL,
    exchange_rate DECIMAL(20, 10),
    CONSTRAINT unq_point_exchangerate_3 UNIQUE (from_merchant_id, to_merchant_id, rate_date)
);

