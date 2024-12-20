package org.example.eticaretapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
@Table(name = "tblimage")
public class Image extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	Long productId;
	String url;
	String title;
	
}