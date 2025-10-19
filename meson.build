project('example',
          version: '0.1.0',
    meson_version: '>= 1.0.0',
  default_options: [ 'warning_level=2', 'werror=false', ],
)

i18n = import('i18n')
gnome = import('gnome')

srcdir = meson.project_source_root() / 'src'

gradlew = find_program('gradlew', required: true)

app_bin = custom_target (
  'gradle-build',
  command: [gradlew, 'installDist'],
  build_always: true,
  console: true
)

subdir('data')
subdir('po')

gnome.post_install(
     glib_compile_schemas: true,
    gtk_update_icon_cache: true,
  update_desktop_database: true,
)
