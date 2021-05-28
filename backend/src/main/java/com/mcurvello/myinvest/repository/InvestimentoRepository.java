package com.mcurvello.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcurvello.myinvest.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long>{

}
