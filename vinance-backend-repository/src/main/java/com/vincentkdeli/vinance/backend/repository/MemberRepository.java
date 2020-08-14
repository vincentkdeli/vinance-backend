package com.vincentkdeli.vinance.backend.repository;

import com.vincentkdeli.vinance.backend.entity.Member;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * @author - Vincent K. Deli
 * @created - 15/08/20
 */

public interface MemberRepository extends ReactiveMongoRepository<Member, String> {
}
