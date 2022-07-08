
package com.portfolio.DO.repository;

import com.portfolio.DO.model.Habilidades_blandas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Habilidades_blandasRepository extends JpaRepository<Habilidades_blandas, Long> {
    
}
