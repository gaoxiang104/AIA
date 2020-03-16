// vue.config.js
module.exports = {
    // 选项...
    publicPath: './', // 基本路径
    outputDir: 'dist', // 输出文件目录
    productionSourceMap: false, // 生产环境是否生成 sourceMap 文件

    lintOnSave: true,    // 启用 lint

    devServer: {
        open: true, // 自动打开浏览器
        port: 8088,  // 端口
        host: 'localhost',
        https: false,
        proxy: {    //代理设置
            '/api': {
                target: '<url>',
                ws: true,
                changeOrigin: true
            },
            '/foo': {
                target: '<other_url>'
            }
        }
    },

    configureWebpack: {
        module: {
            rules: [
                {
                    test: /\.s[ac]ss$/i,
                    use: [
                        // Compiles Sass to CSS
                        'sass-loader',
                    ],
                },
                {
                    test: /\.(gif|png|jpe?g|svg)$/i,
                    use: [
                        // 'file-loader',
                        {
                            loader: 'image-webpack-loader',
                            options: {
                                mozjpeg: {
                                    progressive: true,
                                    quality: 65
                                },
                                // optipng.enabled: false will disable optipng
                                optipng: {
                                    enabled: false,
                                },
                                pngquant: {
                                    quality: [0.65, 0.90],
                                    speed: 4
                                },
                                gifsicle: {
                                    interlaced: false,
                                },
                                // the webp option will enable WEBP
                                webp: {
                                    quality: 75
                                }
                            }
                        },
                    ]
                }
            ]
        }
    }
}