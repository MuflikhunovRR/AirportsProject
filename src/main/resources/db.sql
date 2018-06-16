-- Create TABLE
CREATE TABLE WorldAirports (
  id INT(11) NOT NULL,
  AirportCode VARCHAR(30) NOT NULL,
  CityOrAirportName VARCHAR(30) NOT NULL,
  Country VARCHAR(30) NOT NULL,
  CountryAbbrviation VARCHAR(10) NOT NULL,
  CountryCode INT(11) NOT NULL,
  GMTOffset INT(11) NOT NULL,
  RunwayLengthFeet INT(11) NOT NULL,
  RunwayElevationFeet INT(11) NOT NULL,
  LatitudeDegree INT(11) NOT NULL,
  LatitudeMinute INT(11) NOT NULL,
  LatitudeSecond INT(11) NOT NULL,
  LatitudeNpeerS VARCHAR(5) NOT NULL,
  LongitudeDegree INT(11) NOT NULL,
  LongitudeMinute INT(11) NOT NULL,
  LongitudeSeconds INT(11) NOT NULL,
  LongitudeEperW VARCHAR(5) NOT NULL,
  PRIMARY KEY (id)
);

SELECT * FROM WorldAirports;

-- Insert data
INSERT INTO WorldAirports VALUES
  (1, 'LAX', 'LOS ANGELES INTL', 'United States', 'US', 91, 8, 12091, 126, 33, 56, 0, 'N', 118, 24, 0, 'W'),
  (2, 'FCO', 'ROME DA VINCI', 'Italy', 'IT', 450, -1, 12795, 14, 41, 47,59, 'N', 12, 14, 3, 'E'),
  (3, 'SFO', 'SAN FRANCISCO INTL', 'United States', 'US', 91, 8, 11870, 12, 37, 37, 0, 'N', 122, 23, 0, 'W');