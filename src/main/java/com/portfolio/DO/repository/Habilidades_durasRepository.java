
package com.portfolio.DO.repository;

import com.portfolio.DO.model.Habilidades_duras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Habilidades_durasRepository extends JpaRepository<Habilidades_duras, Long> {
    
}
