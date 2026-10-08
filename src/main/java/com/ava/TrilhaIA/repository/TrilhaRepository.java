package com.ava.TrilhaIA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ava.TrilhaIA.model.TrilhaModel;

public interface TrilhaRepository extends JpaRepository<TrilhaModel, Long> {
}