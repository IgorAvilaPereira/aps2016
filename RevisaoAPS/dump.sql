--
-- PostgreSQL database dump
--

-- Dumped from database version 9.3.11
-- Dumped by pg_dump version 9.3.11
-- Started on 2016-02-24 20:16:39 BRT

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

DROP DATABASE restaurante;
--
-- TOC entry 1980 (class 1262 OID 35946)
-- Name: restaurante; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE restaurante WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'pt_BR.UTF-8' LC_CTYPE = 'pt_BR.UTF-8';


ALTER DATABASE restaurante OWNER TO postgres;

\connect restaurante

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 6 (class 2615 OID 2200)
-- Name: public; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA public;


ALTER SCHEMA public OWNER TO postgres;

--
-- TOC entry 1981 (class 0 OID 0)
-- Dependencies: 6
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON SCHEMA public IS 'standard public schema';


--
-- TOC entry 1 (class 3079 OID 11791)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 1983 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 172 (class 1259 OID 35949)
-- Name: bebida; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE bebida (
    id integer NOT NULL,
    marca text,
    volume integer,
    preco real,
    tipo text
);


ALTER TABLE public.bebida OWNER TO postgres;

--
-- TOC entry 171 (class 1259 OID 35947)
-- Name: bebida_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE bebida_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.bebida_id_seq OWNER TO postgres;

--
-- TOC entry 1984 (class 0 OID 0)
-- Dependencies: 171
-- Name: bebida_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE bebida_id_seq OWNED BY bebida.id;


--
-- TOC entry 1864 (class 2604 OID 35952)
-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY bebida ALTER COLUMN id SET DEFAULT nextval('bebida_id_seq'::regclass);


--
-- TOC entry 1975 (class 0 OID 35949)
-- Dependencies: 172
-- Data for Name: bebida; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO bebida VALUES (1, 'Schin', 350, 5, 'Cerveja');
INSERT INTO bebida VALUES (4, 'Natasha', 1000, 100, 'Vodka');
INSERT INTO bebida VALUES (5, 'Heroína', 2000, 20, NULL);


--
-- TOC entry 1985 (class 0 OID 0)
-- Dependencies: 171
-- Name: bebida_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('bebida_id_seq', 5, true);


--
-- TOC entry 1866 (class 2606 OID 35957)
-- Name: bebida_pk; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY bebida
    ADD CONSTRAINT bebida_pk PRIMARY KEY (id);


--
-- TOC entry 1982 (class 0 OID 0)
-- Dependencies: 6
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2016-02-24 20:16:40 BRT

--
-- PostgreSQL database dump complete
--

