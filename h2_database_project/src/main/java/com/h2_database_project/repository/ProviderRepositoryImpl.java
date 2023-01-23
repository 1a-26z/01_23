package com.h2_database_project.repository;

import com.h2_database_project.pojo.Provider;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.DynamicType;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.*;
import java.util.function.Function;

@NoArgsConstructor
public class ProviderRepositoryImpl implements ProviderRepository{

    private Map<String, Provider> map = new HashMap<>();

    public ProviderRepositoryImpl(Map<String, Provider> map) {
        this.map = map;
    }
    @Override
    public Optional<Provider> findById(String s) {
        if (map.containsKey(s)) {
            return Optional.ofNullable(map.get(s));
        }
        return Optional.empty();
    }

    @Override
    public List<Provider> findAll() {
        List<Provider> list = new ArrayList<>();
        for (String s : map.keySet()) {
            list.add(map.get(s));
        }
        return list;
    }

    @Override
    public Provider save(Provider entity) {
        map.put(entity.getId(), entity);
        return entity;
    }

    @Override
    public List<Provider> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public List<Provider> findAll(Sort sort) {
        return null;
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Page<Provider> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Provider entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Provider> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Provider> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Provider> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Provider> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Provider> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Provider getOne(String s) {
        return null;
    }

    @Override
    public Provider getById(String s) {
        return null;
    }

    @Override
    public Provider getReferenceById(String s) {
        return null;
    }

    @Override
    public <S extends Provider> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Provider> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Provider> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Provider> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Provider> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Provider> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Provider, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
