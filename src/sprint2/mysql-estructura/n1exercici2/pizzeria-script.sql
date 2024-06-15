-- MySQL Script generated by MySQL Workbench
-- Tue Jun 11 12:47:07 2024
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema pizzeria
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema pizzeria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `pizzeria` DEFAULT CHARACTER SET utf8mb4 ;
USE `pizzeria` ;

-- -----------------------------------------------------
-- Table `pizzeria`.`pizzas_categories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`pizzas_categories` (
  `pizzas_categories_id` INT(11) NOT NULL AUTO_INCREMENT,
  `pizzas_categories_name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`pizzas_categories_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `pizzeria`.`products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`products` (
  `products_id` INT(11) NOT NULL AUTO_INCREMENT,
  `products_name` VARCHAR(100) NOT NULL,
  `products_type` ENUM('burgers', 'drinks', 'pizzas') NOT NULL,
  `products_description` VARCHAR(255) NOT NULL,
  `products_image` VARCHAR(255) NULL DEFAULT NULL,
  `products_price` DECIMAL(5,2) NOT NULL,
  `pizzas_categories_id` INT(11) NULL,
  PRIMARY KEY (`products_id`),
  INDEX `fk_products_pizzas_categories1_idx` (`pizzas_categories_id` ASC),
  CONSTRAINT `fk_products_pizzas_categories1`
    FOREIGN KEY (`pizzas_categories_id`)
    REFERENCES `pizzeria`.`pizzas_categories` (`pizzas_categories_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `pizzeria`.`provinces`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`provinces` (
  `provinces_id` INT(2) NOT NULL AUTO_INCREMENT,
  `provinces_name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`provinces_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `pizzeria`.`towns`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`towns` (
  `towns_id` INT(11) NOT NULL AUTO_INCREMENT,
  `towns_name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`towns_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `pizzeria`.`customers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`customers` (
  `customers_id` INT(11) NOT NULL AUTO_INCREMENT,
  `customers_fname` VARCHAR(100) NOT NULL,
  `customers_lname` VARCHAR(100) NOT NULL,
  `customers_address` VARCHAR(255) NOT NULL,
  `customers_postcode` VARCHAR(10) NOT NULL,
  `towns_id` INT(11) NOT NULL,
  `provinces_id` INT(2) NOT NULL,
  `customers_tel` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`customers_id`),
  INDEX `fk_customers_provinces1_idx` (`provinces_id` ASC),
  INDEX `fk_customers_towns1_idx` (`towns_id` ASC),
  CONSTRAINT `fk_customers_provinces1`
    FOREIGN KEY (`provinces_id`)
    REFERENCES `pizzeria`.`provinces` (`provinces_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_customers_towns1`
    FOREIGN KEY (`towns_id`)
    REFERENCES `pizzeria`.`towns` (`towns_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `pizzeria`.`restaurants`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`restaurants` (
  `restaurants_id` INT(11) NOT NULL AUTO_INCREMENT,
  `restaurants_address` VARCHAR(255) NOT NULL,
  `restaurants_postcode` VARCHAR(10) NOT NULL,
  `provinces_id` INT(2) NOT NULL,
  `towns_id` INT(11) NOT NULL,
  PRIMARY KEY (`restaurants_id`),
  INDEX `fk_restaurants_provinces1_idx` (`provinces_id` ASC),
  INDEX `fk_restaurants_towns1_idx` (`towns_id` ASC),
  CONSTRAINT `fk_restaurants_provinces1`
    FOREIGN KEY (`provinces_id`)
    REFERENCES `pizzeria`.`provinces` (`provinces_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_restaurants_towns1`
    FOREIGN KEY (`towns_id`)
    REFERENCES `pizzeria`.`towns` (`towns_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `pizzeria`.`staff`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`staff` (
  `staff_id` INT(11) NOT NULL AUTO_INCREMENT,
  `staff_fname` VARCHAR(100) NOT NULL,
  `staff_lname` VARCHAR(100) NOT NULL,
  `staff_nif` VARCHAR(9) NOT NULL,
  `staff_tel` VARCHAR(15) NOT NULL,
  `staff_position` ENUM('cook', 'delivery') NOT NULL,
  `restaurants_id` INT(11) NOT NULL,
  PRIMARY KEY (`staff_id`),
  INDEX `fk_staff_restaurants1_idx` (`restaurants_id` ASC),
  CONSTRAINT `fk_staff_restaurants1`
    FOREIGN KEY (`restaurants_id`)
    REFERENCES `pizzeria`.`restaurants` (`restaurants_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

-- -----------------------------------------------------
-- Table `pizzeria`.`deliveries`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`deliveries` (
  `deliveries_id` INT(11) NOT NULL AUTO_INCREMENT,
  `orders_id` INT(11) NOT NULL,
  `deliveries_date_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP(),
  `staff_id` INT(11) NOT NULL,
  PRIMARY KEY (`deliveries_id`),
  INDEX `fk_deliveries_staff1_idx` (`staff_id` ASC),
  CONSTRAINT `fk_deliveries_staff1`
    FOREIGN KEY (`staff_id`)
    REFERENCES `pizzeria`.`staff` (`staff_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `pizzeria`.`orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`orders` (
  `orders_id` INT(11) NOT NULL AUTO_INCREMENT,
  `orders_date_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP(),
  `orders_delivery` ENUM('takeaway', 'delivery') NOT NULL,
  `orders_total_price` DECIMAL(10,2) NOT NULL,
  `customers_id` INT(11) NOT NULL,
  `restaurants_id` INT(11) NOT NULL,
  `deliveries_id` INT(11) NULL, 
  PRIMARY KEY (`orders_id`, `customers_id`, `restaurants_id`),
  INDEX `fk_orders_customers1_idx` (`customers_id` ASC),
  INDEX `fk_orders_restaurants1_idx` (`restaurants_id` ASC),
  INDEX `fk_orders_deliveries1_idx` (`deliveries_id` ASC),
  CONSTRAINT `fk_orders_customers1`
    FOREIGN KEY (`customers_id`)
    REFERENCES `pizzeria`.`customers` (`customers_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_orders_restaurants1`
    FOREIGN KEY (`restaurants_id`)
    REFERENCES `pizzeria`.`restaurants` (`restaurants_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_orders_deliveries1`
    FOREIGN KEY (`deliveries_id`)
    REFERENCES `pizzeria`.`deliveries` (`deliveries_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `pizzeria`.`orders_has_products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`orders_has_products` (
  `orders_id` INT(11) NOT NULL,
  `customers_id` INT(11) NOT NULL,
  `restaurants_id` INT(11) NOT NULL,
  `products_id` INT(11) NOT NULL,
  `orders_has_products_quantity` INT(3) NOT NULL,
  PRIMARY KEY (`orders_id`, `customers_id`, `restaurants_id`, `products_id`),
  INDEX `fk_orders_has_products_orders1_idx` (`orders_id` ASC, `customers_id` ASC, `restaurants_id` ASC),
  INDEX `fk_orders_has_products_products1_idx` (`products_id` ASC),
  CONSTRAINT `fk_orders_has_products_orders1`
    FOREIGN KEY (`orders_id` , `customers_id` , `restaurants_id`)
    REFERENCES `pizzeria`.`orders` (`orders_id` , `customers_id` , `restaurants_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_orders_has_products_products1`
    FOREIGN KEY (`products_id`)
    REFERENCES `pizzeria`.`products` (`products_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
