package com.tarento.commenthub.repository;

import com.tarento.commenthub.entity.CommentTree;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CommentTreeRepository extends JpaRepository<CommentTree, String> {

}