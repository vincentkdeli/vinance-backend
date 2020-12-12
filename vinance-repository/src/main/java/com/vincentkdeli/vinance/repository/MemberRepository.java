package com.vincentkdeli.vinance.repository;

import com.vincentkdeli.vinance.entity.Member;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * @author - Vincent K. Deli
 **/

public interface MemberRepository extends ReactiveMongoRepository<Member, String> {
}
