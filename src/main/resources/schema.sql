CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
CREATE TABLE elements (
    id uuid DEFAULT uuid_generate_v4 (),
    parent bool NOT NULL,
    parent_id uuid,
    element_url text NOT NULL,
    update_date date NOT NULL
);