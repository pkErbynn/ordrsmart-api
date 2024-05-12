CREATE TABLE IF NOT EXISTS products (
      id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
      name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS addresses (
    id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    line1 VARCHAR(255) NOT NULL,
    line2 VARCHAR(255),
    city VARCHAR(100) NOT NULL,
    state VARCHAR(100) NOT NULL,
    zip_code VARCHAR(20) NOT NULL
);

-- Create the ProductVariant table
CREATE TABLE IF NOT EXISTS product_variants (
    id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS sample_requests (
     id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
     product_id BIGINT NOT NULL,
     variant_id BIGINT NOT NULL,
     sample_quantity VARCHAR(100) NOT NULL,
     sample_application TEXT,
     address_id BIGINT NOT NULL,
     additional_information TEXT,
     created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
     created_by VARCHAR(255) NOT NULL,
     FOREIGN KEY (product_id) REFERENCES products(id),
     FOREIGN KEY (variant_id) REFERENCES product_variants(id),
     FOREIGN KEY (address_id) REFERENCES addresses(id)
);



-- Create the ProductVariantAttributes table
CREATE TABLE IF NOT EXISTS product_variant_attributes (
    variant_id BIGINT NOT NULL,
    attribute_key VARCHAR(255) NOT NULL,
    attribute_value VARCHAR(255) NOT NULL,
    CONSTRAINT fk_variant_id FOREIGN KEY (variant_id) REFERENCES product_variants(id) ON DELETE CASCADE
);