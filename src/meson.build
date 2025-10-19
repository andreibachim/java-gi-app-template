example_sources = [
  'main.vala',
  'application.vala',
  'window.vala',
]

example_deps = [
  config_dep,
  dependency('gtk4'),
  dependency('libadwaita-1', version: '>= 1.4'),
]

example_sources += gnome.compile_resources('example-resources',
  'example.gresource.xml',
  c_name: 'example'
)

executable('example', example_sources,
  dependencies: example_deps,
  include_directories: config_inc,
       install: true,
)
