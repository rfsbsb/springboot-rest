package com.binarybolts.repositories;

import com.binarybolts.domain.Author;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {
}
