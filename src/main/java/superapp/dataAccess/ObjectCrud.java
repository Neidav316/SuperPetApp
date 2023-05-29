package superapp.dataAccess;

import org.springframework.data.domain.Pageable;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import superapp.data.SuperappObjectsEntity;

import java.util.List;
import java.util.Optional;


public interface ObjectCrud extends ListCrudRepository<SuperappObjectsEntity, String>,
        PagingAndSortingRepository<SuperappObjectsEntity, String> {
    public List<SuperappObjectsEntity> findAllByChildrenContains(SuperappObjectsEntity theChild, Pageable pageable);
    public List<SuperappObjectsEntity> findAllByChildrenContainsAndActiveIsTrue(SuperappObjectsEntity theChild, Pageable pageable);
    public List<SuperappObjectsEntity> findAllByParentsContains(SuperappObjectsEntity parentObject, Pageable pageable);
    public List<SuperappObjectsEntity> findAllByParentsContainsAndActiveIsTrue(SuperappObjectsEntity parentObject, Pageable pageable);
    public List<SuperappObjectsEntity> findAllByType(@Param("type") String type, Pageable pageable);
    public List<SuperappObjectsEntity> findAllByTypeAndActiveIsTrue(@Param("type") String type, Pageable pageable);
    public List<SuperappObjectsEntity> findAllByAlias(@Param("alias") String alias, Pageable pageable);
    public List<SuperappObjectsEntity> findAllByAliasAndActiveIsTrue(@Param("alias") String alias, Pageable pageable);
    public List<SuperappObjectsEntity> findAllByLocationNear(@Param("location") Point location , @Param("maxDistance") Distance distance, Pageable pageable);
    public List<SuperappObjectsEntity> findAllByLocationNearAndActiveIsTrue(@Param("location") Point location , @Param("maxDistance") Distance distance, Pageable pageable, @Param("active") boolean active);
    public List<SuperappObjectsEntity> findAllByActive(@Param("active") boolean active, Pageable pageable);
    public Optional<SuperappObjectsEntity> findByObjectIdAndActiveIsTrue(@Param("objectId") String objectId);


}
