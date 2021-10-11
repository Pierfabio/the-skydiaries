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
                    <Col>1 of 3</Col>
                    <Col md={4}><Image src={require('../assets/wing-plane.jpg')} rounded /></Col>
                    <Col>2 of 3</Col>
                </Row>
            </Container>
   
    )