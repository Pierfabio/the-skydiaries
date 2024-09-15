import React from 'react';
import { Image, Row, Col, Container } from 'react-bootstrap';


export const Home = () => (
 /*        <div>
            <h2>Hello World!</h2>
            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>
            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>
            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>
        </div> */
 
            <Container>
                <Row>
                    <Col md={2}>1 of 3</Col>
                    <Col md={8}><Image src={require('../assets/airplane-wing.jpg')} rounded /></Col>
                    <Col md={2}>3 of 3</Col>
                </Row>
            </Container>
   
    )