package com.api.parkingcontrol.models;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_Parking_Spot")


public class ParkingSpotModel implements Serializable {

		private static final long serialVersionUID = 1L;
		

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id1;
	@Column(nullable = false, unique = true, length =10)
	private String parkingSpotNumber;
	

	
	
	
}
