package io.github.colderjacket;

import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;

import java.util.ArrayList;

public class Permissions
{
    public static final String NEWS_VIEW_PERMISSION = "news.view";
    public static final String NEWS_EDIT_PERMISSION = "news.edit";

    private static final ArrayList<Permission> permissions = new ArrayList<>();

    public static void registerPermissions()
    {
        permissions.add(new Permission(NEWS_VIEW_PERMISSION, "Allows players to view the News", PermissionDefault.TRUE));
        permissions.add(new Permission(NEWS_EDIT_PERMISSION, "Allows players to edit the News", PermissionDefault.OP));
    }

    public static ArrayList<Permission> getPermissions()
    {
        return permissions;
    }

}
