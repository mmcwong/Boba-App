//
//  BAProfileManager.m
//  BobaApp
//
//  Created by Hyun Bin Kim on 2014-10-04.
//  Copyright (c) 2014 coursera interns. All rights reserved.
//

#import "BAProfileManager.h"

@interface BAProfileManager()

@property (nonatomic, strong) NSString *userName;
@property (nonatomic, strong) NSString *password;
@property (nonatomic, strong) NSString *userId;

@end

@implementation BAProfileManager

+ (id)sharedManager {
    static BAProfileManager *sharedManager = nil;
    static dispatch_once_t once_token;
    dispatch_once(&once_token, ^{
        sharedManager = [[self alloc] init];
    });
    
    return sharedManager;
}

- (instancetype)init
{
    self = [super init];
    if (self) {
    }
    return self;
}



@end
