package com.jonasermert.repository.access;

import com.jonasermert.repository.JpaDataAccessObject;
import com.jonasermert.repository.access.interfaces.IGroupDataAccess;
import com.jonasermert.repository.entities.Group;

public class GroupDataAccess extends JpaDataAccessObject<Group, Integer> implements IGroupDataAccess {

}
