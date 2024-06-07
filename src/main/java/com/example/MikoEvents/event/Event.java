package com.example.MikoEvents.event;

import java.time.LocalDate;

import com.example.MikoEvents.category.Category;
import com.example.MikoEvents.location.Location;
import com.example.MikoEvents.organizer.Organizer;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "event")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String description;

	@Column(nullable = false)
	private LocalDate date;

	@Column(nullable = false)
	private LocalDate dateFrom;

	@Column(nullable = false)
	private LocalDate dateTo;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "location_id", nullable = false)
	private Location location;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "organizer_id", nullable = false)
	private Organizer organizer;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;
}
